package com.neoa11y.analyzer.core

import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri

abstract class Installer : ContentProvider() {

    override fun query(
        uri: Uri,
        projectionArg: Array<String>?,
        selection: String?,
        selectionArgs: Array<String>?,
        sortOrder: String?
    ): Cursor? = null

    override fun getType(uri: Uri): String? = null

    override fun insert(
        uri: Uri,
        contentValues: ContentValues?
    ): Uri? = null

    override fun delete(
        uri: Uri,
        selection: String?,
        selectionArgs: Array<out String>?
    ): Int = 0

    override fun update(
        uri: Uri, values: ContentValues?,
        selection: String?,
        selectionArgs: Array<out String>?
    ): Int = 0
}
