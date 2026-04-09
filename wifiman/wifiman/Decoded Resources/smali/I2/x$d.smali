.class public LI2/x$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI2/o;
.implements LI2/x$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI2/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field private final a:Landroid/content/ContentResolver;


# direct methods
.method public constructor <init>(Landroid/content/ContentResolver;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI2/x$d;->a:Landroid/content/ContentResolver;

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)Lcom/bumptech/glide/load/data/d;
    .locals 2

    new-instance v0, Lcom/bumptech/glide/load/data/n;

    iget-object v1, p0, LI2/x$d;->a:Landroid/content/ContentResolver;

    invoke-direct {v0, v1, p1}, Lcom/bumptech/glide/load/data/n;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;)V

    return-object v0
.end method

.method public d(LI2/r;)LI2/n;
    .locals 0

    new-instance p1, LI2/x;

    invoke-direct {p1, p0}, LI2/x;-><init>(LI2/x$c;)V

    return-object p1
.end method
