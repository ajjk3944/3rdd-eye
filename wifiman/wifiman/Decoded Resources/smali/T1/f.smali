.class public final LT1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT1/f$b;,
        LT1/f$c;,
        LT1/f$a;
    }
.end annotation


# instance fields
.field private final a:LT1/f$b;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "textView cannot be null"

    invoke-static {p1, v0}, LE1/h;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p2, :cond_0

    new-instance p2, LT1/f$c;

    invoke-direct {p2, p1}, LT1/f$c;-><init>(Landroid/widget/TextView;)V

    iput-object p2, p0, LT1/f;->a:LT1/f$b;

    goto :goto_0

    :cond_0
    new-instance p2, LT1/f$a;

    invoke-direct {p2, p1}, LT1/f$a;-><init>(Landroid/widget/TextView;)V

    iput-object p2, p0, LT1/f;->a:LT1/f$b;

    :goto_0
    return-void
.end method


# virtual methods
.method public a([Landroid/text/InputFilter;)[Landroid/text/InputFilter;
    .locals 1

    iget-object v0, p0, LT1/f;->a:LT1/f$b;

    invoke-virtual {v0, p1}, LT1/f$b;->a([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    return-object p1
.end method

.method public b(Z)V
    .locals 1

    iget-object v0, p0, LT1/f;->a:LT1/f$b;

    invoke-virtual {v0, p1}, LT1/f$b;->b(Z)V

    return-void
.end method

.method public c(Z)V
    .locals 1

    iget-object v0, p0, LT1/f;->a:LT1/f$b;

    invoke-virtual {v0, p1}, LT1/f$b;->c(Z)V

    return-void
.end method
