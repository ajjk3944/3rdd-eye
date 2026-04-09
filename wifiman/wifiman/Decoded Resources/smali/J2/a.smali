.class public LJ2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI2/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ2/a$a;
    }
.end annotation


# static fields
.field public static final b:LC2/f;


# instance fields
.field private final a:LI2/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x9c4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout"

    invoke-static {v1, v0}, LC2/f;->f(Ljava/lang/String;Ljava/lang/Object;)LC2/f;

    move-result-object v0

    sput-object v0, LJ2/a;->b:LC2/f;

    return-void
.end method

.method public constructor <init>(LI2/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ2/a;->a:LI2/m;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;IILC2/g;)LI2/n$a;
    .locals 0

    check-cast p1, LI2/h;

    invoke-virtual {p0, p1, p2, p3, p4}, LJ2/a;->c(LI2/h;IILC2/g;)LI2/n$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, LI2/h;

    invoke-virtual {p0, p1}, LJ2/a;->d(LI2/h;)Z

    move-result p1

    return p1
.end method

.method public c(LI2/h;IILC2/g;)LI2/n$a;
    .locals 0

    iget-object p2, p0, LJ2/a;->a:LI2/m;

    if-eqz p2, :cond_1

    const/4 p3, 0x0

    invoke-virtual {p2, p1, p3, p3}, LI2/m;->a(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LI2/h;

    if-nez p2, :cond_0

    iget-object p2, p0, LJ2/a;->a:LI2/m;

    invoke-virtual {p2, p1, p3, p3, p1}, LI2/m;->b(Ljava/lang/Object;IILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    move-object p1, p2

    :cond_1
    :goto_0
    sget-object p2, LJ2/a;->b:LC2/f;

    invoke-virtual {p4, p2}, LC2/g;->c(LC2/f;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    new-instance p3, LI2/n$a;

    new-instance p4, Lcom/bumptech/glide/load/data/j;

    invoke-direct {p4, p1, p2}, Lcom/bumptech/glide/load/data/j;-><init>(LI2/h;I)V

    invoke-direct {p3, p1, p4}, LI2/n$a;-><init>(LC2/e;Lcom/bumptech/glide/load/data/d;)V

    return-object p3
.end method

.method public d(LI2/h;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
