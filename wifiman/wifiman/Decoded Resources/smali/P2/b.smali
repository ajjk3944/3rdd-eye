.class public LP2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP2/e;


# instance fields
.field private final a:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LW2/k;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/res/Resources;

    iput-object p1, p0, LP2/b;->a:Landroid/content/res/Resources;

    return-void
.end method


# virtual methods
.method public a(LE2/c;LC2/g;)LE2/c;
    .locals 0

    iget-object p2, p0, LP2/b;->a:Landroid/content/res/Resources;

    invoke-static {p2, p1}, Lcom/bumptech/glide/load/resource/bitmap/s;->f(Landroid/content/res/Resources;LE2/c;)LE2/c;

    move-result-object p1

    return-object p1
.end method
