package com.example.appdevca2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {

    private Context context;
    private List<Book> books;
    private OnItemClickListener listener;

    // Interface to handle item clicks
    public interface OnItemClickListener {
        void onItemClick(Book book);
    }

    public BookAdapter(Context context, List<Book> books, OnItemClickListener listener) {
        this.context = context;
        this.books = books;
        this.listener = listener;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.book_item, parent, false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        Book book = books.get(position);

        holder.bookNameText.setText(book.getName());
        holder.bookStatusText.setText(book.getStatus());

        // Initially, the review is hidden
        holder.bookReviewText.setVisibility(View.GONE);

        // When the item is clicked, show the review
        holder.itemView.setOnClickListener(v -> {
            // Show the review on click
            if (book.hasReview()) {
                holder.bookReviewText.setText(book.getReview());
                holder.bookReviewText.setVisibility(View.VISIBLE);
            } else {
                Toast.makeText(context, "No review available", Toast.LENGTH_SHORT).show();
            }

            // Notify the listener about the click event (if needed)
            if (listener != null) {
                listener.onItemClick(book);
            }
        });
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    static class BookViewHolder extends RecyclerView.ViewHolder {

        TextView bookNameText, bookReviewText, bookStatusText;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            bookNameText = itemView.findViewById(R.id.bookNameText);
            bookReviewText = itemView.findViewById(R.id.bookReviewText);
            bookStatusText = itemView.findViewById(R.id.bookStatusText);
        }
    }
}
