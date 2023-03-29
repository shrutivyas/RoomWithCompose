package com.brainjug.roomwithcompose.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bf\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lcom/brainjug/roomwithcompose/interfaces/ContactEvent;", "", "DeleteContact", "HideDialog", "SaveContact", "SetFirstName", "SetLastName", "SetPhoneNumber", "ShowDialog", "SortContacts", "app_debug"})
public abstract interface ContactEvent {
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/brainjug/roomwithcompose/interfaces/ContactEvent$SaveContact;", "Lcom/brainjug/roomwithcompose/interfaces/ContactEvent;", "()V", "app_debug"})
    public static final class SaveContact implements com.brainjug.roomwithcompose.interfaces.ContactEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.brainjug.roomwithcompose.interfaces.ContactEvent.SaveContact INSTANCE = null;
        
        private SaveContact() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/brainjug/roomwithcompose/interfaces/ContactEvent$SetFirstName;", "Lcom/brainjug/roomwithcompose/interfaces/ContactEvent;", "firstName", "", "(Ljava/lang/String;)V", "getFirstName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class SetFirstName implements com.brainjug.roomwithcompose.interfaces.ContactEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String firstName = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.brainjug.roomwithcompose.interfaces.ContactEvent.SetFirstName copy(@org.jetbrains.annotations.NotNull()
        java.lang.String firstName) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public SetFirstName(@org.jetbrains.annotations.NotNull()
        java.lang.String firstName) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFirstName() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/brainjug/roomwithcompose/interfaces/ContactEvent$SetLastName;", "Lcom/brainjug/roomwithcompose/interfaces/ContactEvent;", "lastName", "", "(Ljava/lang/String;)V", "getLastName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class SetLastName implements com.brainjug.roomwithcompose.interfaces.ContactEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String lastName = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.brainjug.roomwithcompose.interfaces.ContactEvent.SetLastName copy(@org.jetbrains.annotations.NotNull()
        java.lang.String lastName) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public SetLastName(@org.jetbrains.annotations.NotNull()
        java.lang.String lastName) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLastName() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/brainjug/roomwithcompose/interfaces/ContactEvent$SetPhoneNumber;", "Lcom/brainjug/roomwithcompose/interfaces/ContactEvent;", "phoneNumber", "", "(Ljava/lang/String;)V", "getPhoneNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class SetPhoneNumber implements com.brainjug.roomwithcompose.interfaces.ContactEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String phoneNumber = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.brainjug.roomwithcompose.interfaces.ContactEvent.SetPhoneNumber copy(@org.jetbrains.annotations.NotNull()
        java.lang.String phoneNumber) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public SetPhoneNumber(@org.jetbrains.annotations.NotNull()
        java.lang.String phoneNumber) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPhoneNumber() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/brainjug/roomwithcompose/interfaces/ContactEvent$ShowDialog;", "Lcom/brainjug/roomwithcompose/interfaces/ContactEvent;", "()V", "app_debug"})
    public static final class ShowDialog implements com.brainjug.roomwithcompose.interfaces.ContactEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.brainjug.roomwithcompose.interfaces.ContactEvent.ShowDialog INSTANCE = null;
        
        private ShowDialog() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/brainjug/roomwithcompose/interfaces/ContactEvent$HideDialog;", "Lcom/brainjug/roomwithcompose/interfaces/ContactEvent;", "()V", "app_debug"})
    public static final class HideDialog implements com.brainjug.roomwithcompose.interfaces.ContactEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.brainjug.roomwithcompose.interfaces.ContactEvent.HideDialog INSTANCE = null;
        
        private HideDialog() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/brainjug/roomwithcompose/interfaces/ContactEvent$SortContacts;", "Lcom/brainjug/roomwithcompose/interfaces/ContactEvent;", "sortType", "Lcom/brainjug/roomwithcompose/utils/SortType;", "(Lcom/brainjug/roomwithcompose/utils/SortType;)V", "getSortType", "()Lcom/brainjug/roomwithcompose/utils/SortType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class SortContacts implements com.brainjug.roomwithcompose.interfaces.ContactEvent {
        @org.jetbrains.annotations.NotNull()
        private final com.brainjug.roomwithcompose.utils.SortType sortType = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.brainjug.roomwithcompose.interfaces.ContactEvent.SortContacts copy(@org.jetbrains.annotations.NotNull()
        com.brainjug.roomwithcompose.utils.SortType sortType) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public SortContacts(@org.jetbrains.annotations.NotNull()
        com.brainjug.roomwithcompose.utils.SortType sortType) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.brainjug.roomwithcompose.utils.SortType component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.brainjug.roomwithcompose.utils.SortType getSortType() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/brainjug/roomwithcompose/interfaces/ContactEvent$DeleteContact;", "Lcom/brainjug/roomwithcompose/interfaces/ContactEvent;", "contact", "Lcom/brainjug/roomwithcompose/data/Contact;", "(Lcom/brainjug/roomwithcompose/data/Contact;)V", "getContact", "()Lcom/brainjug/roomwithcompose/data/Contact;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class DeleteContact implements com.brainjug.roomwithcompose.interfaces.ContactEvent {
        @org.jetbrains.annotations.NotNull()
        private final com.brainjug.roomwithcompose.data.Contact contact = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.brainjug.roomwithcompose.interfaces.ContactEvent.DeleteContact copy(@org.jetbrains.annotations.NotNull()
        com.brainjug.roomwithcompose.data.Contact contact) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public DeleteContact(@org.jetbrains.annotations.NotNull()
        com.brainjug.roomwithcompose.data.Contact contact) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.brainjug.roomwithcompose.data.Contact component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.brainjug.roomwithcompose.data.Contact getContact() {
            return null;
        }
    }
}