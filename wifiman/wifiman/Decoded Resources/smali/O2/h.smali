.class public final LO2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC2/i;


# instance fields
.field private final a:LF2/d;


# direct methods
.method public constructor <init>(LF2/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO2/h;->a:LF2/d;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;LC2/g;)Z
    .locals 0

    check-cast p1, LB2/a;

    invoke-virtual {p0, p1, p2}, LO2/h;->d(LB2/a;LC2/g;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILC2/g;)LE2/c;
    .locals 0

    check-cast p1, LB2/a;

    invoke-virtual {p0, p1, p2, p3, p4}, LO2/h;->c(LB2/a;IILC2/g;)LE2/c;

    move-result-object p1

    return-object p1
.end method

.method public c(LB2/a;IILC2/g;)LE2/c;
    .locals 0

    invoke-interface {p1}, LB2/a;->getNextFrame()Landroid/graphics/Bitmap;

    move-result-object p1

    iget-object p2, p0, LO2/h;->a:LF2/d;

    invoke-static {p1, p2}, Lcom/bumptech/glide/load/resource/bitmap/g;->f(Landroid/graphics/Bitmap;LF2/d;)Lcom/bumptech/glide/load/resource/bitmap/g;

    move-result-object p1

    return-object p1
.end method

.method public d(LB2/a;LC2/g;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
