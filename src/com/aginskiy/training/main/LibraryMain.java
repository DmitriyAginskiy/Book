package com.aginskiy.training.main;

import com.aginskiy.training.builder.LibraryBuilder;
import com.aginskiy.training.entity.Book;
import com.aginskiy.training.entity.Library;
import com.aginskiy.training.report.LibraryReport;
import com.aginskiy.training.service.LibraryService;

public class LibraryMain {
    public static void main(String[] args) {
        LibraryBuilder libraryBuilder = new LibraryBuilder();
        Library library = libraryBuilder.generateLibrary(10);
        LibraryService libraryService = new LibraryService();
        libraryService.searchBooksByYear(library, 2000);
        LibraryReport libraryReport = new LibraryReport();
        libraryReport.reportLibrary(library);
    }
}
