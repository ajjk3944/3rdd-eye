.class public final LI2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI2/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI2/e$a;,
        LI2/e$b;,
        LI2/e$c;
    }
.end annotation


# instance fields
.field private final a:LI2/e$a;


# direct methods
.method public constructor <init>(LI2/e$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI2/e;->a:LI2/e$a;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;IILC2/g;)LI2/n$a;
    .locals 1

    new-instance p2, LI2/n$a;

    new-instance p3, LV2/b;

    invoke-direct {p3, p1}, LV2/b;-><init>(Ljava/lang/Object;)V

    new-instance p4, LI2/e$b;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, LI2/e;->a:LI2/e$a;

    invoke-direct {p4, p1, v0}, LI2/e$b;-><init>(Ljava/lang/String;LI2/e$a;)V

    invoke-direct {p2, p3, p4}, LI2/n$a;-><init>(LC2/e;Lcom/bumptech/glide/load/data/d;)V

    return-object p2
.end method

.method public b(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "data:image"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
