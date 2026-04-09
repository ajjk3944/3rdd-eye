.class final LIc/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIc/b;-><init>(LZc/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LIc/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LIc/b$a;

    invoke-direct {v0}, LIc/b$a;-><init>()V

    sput-object v0, LIc/b$a;->a:LIc/b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LZc/e;)Ljava/util/List;
    .locals 8

    const-string v0, "networkConnection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LZc/e;->b()LZc/e$a;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, LZc/e;->c()LZc/e$a;

    move-result-object v0

    :cond_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, LZc/e$a;->a()Linet/ipaddr/g;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, LZc/e$a;->c()I

    move-result p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    new-instance v0, LIc/a$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const-wide v5, 0x7fffffffffffffffL

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, LIc/a$a;-><init>(Linet/ipaddr/g;JJLjava/lang/Integer;)V

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_3

    :cond_2
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    :cond_3
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZc/e;

    invoke-virtual {p0, p1}, LIc/b$a;->a(LZc/e;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
