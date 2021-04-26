package c.m.koskosan.util

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

/**
 * Utility file for helping redundant code of View widget feature
 */

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.invisible() {
    visibility = View.INVISIBLE
}

fun View.gone() {
    visibility = View.GONE
}

fun View.snackBarBasicShort(title: String) {
    Snackbar.make(this, title, Snackbar.LENGTH_SHORT).show()
}

fun View.snackBarWarningLong(title: String) {
    Snackbar.make(this, title, Snackbar.LENGTH_LONG)
        .setTextColor(Color.WHITE)
        .setBackgroundTint(Color.RED)
        .show()
}

fun View.snackBarBasicIndefiniteAction(
    title: String,
    actionTitle: String,
    action: (View) -> Unit
) {
    Snackbar.make(this, title, Snackbar.LENGTH_INDEFINITE).setAction(actionTitle) {
        action(it)
    }.show()
}

fun View.snackBarWarningIndefiniteAction(
    title: String,
    actionTitle: String,
    action: (View) -> Unit
) {
    Snackbar.make(this, title, Snackbar.LENGTH_INDEFINITE).setAction(actionTitle) {
        action(it)
    }
        .setTextColor(Color.WHITE)
        .setBackgroundTint(Color.RED)
        .setActionTextColor(Color.WHITE)
        .show()
}

fun View.snackBarBasicIndefinite(
    title: String
) {
    Snackbar.make(this, title, Snackbar.LENGTH_INDEFINITE).show()
}

fun sendMessageWhatsApp(packageContext: Context, uriWhatsApp: String) {
    val whatsAppIntent = Intent(Intent.ACTION_VIEW).apply {
        data = Uri.parse(uriWhatsApp)
    }

    packageContext.startActivity(whatsAppIntent)
}