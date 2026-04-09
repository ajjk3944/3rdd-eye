.class Lcom/google/android/material/internal/n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF1/F;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/internal/n;->b(Landroid/view/View;Lcom/google/android/material/internal/n$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/material/internal/n$c;

.field final synthetic b:Lcom/google/android/material/internal/n$d;


# direct methods
.method constructor <init>(Lcom/google/android/material/internal/n$c;Lcom/google/android/material/internal/n$d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/internal/n$a;->a:Lcom/google/android/material/internal/n$c;

    iput-object p2, p0, Lcom/google/android/material/internal/n$a;->b:Lcom/google/android/material/internal/n$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;LF1/w0;)LF1/w0;
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/internal/n$a;->a:Lcom/google/android/material/internal/n$c;

    new-instance v1, Lcom/google/android/material/internal/n$d;

    iget-object v2, p0, Lcom/google/android/material/internal/n$a;->b:Lcom/google/android/material/internal/n$d;

    invoke-direct {v1, v2}, Lcom/google/android/material/internal/n$d;-><init>(Lcom/google/android/material/internal/n$d;)V

    invoke-interface {v0, p1, p2, v1}, Lcom/google/android/material/internal/n$c;->a(Landroid/view/View;LF1/w0;Lcom/google/android/material/internal/n$d;)LF1/w0;

    move-result-object p1

    return-object p1
.end method
