.class final LNc/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNc/c;->m(Linet/ipaddr/g;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Linet/ipaddr/g;


# direct methods
.method constructor <init>(Linet/ipaddr/g;)V
    .locals 0

    iput-object p1, p0, LNc/c$b;->a:Linet/ipaddr/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LNc/a$a;)Ll9/a;
    .locals 9

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll9/a;

    instance-of v1, p1, LNc/a$a$b;

    if-eqz v1, :cond_0

    new-instance v1, LNc/b$b;

    iget-object v3, p0, LNc/c$b;->a:Linet/ipaddr/g;

    check-cast p1, LNc/a$a$b;

    invoke-virtual {p1}, LNc/a$a$b;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const-wide v7, 0x7fffffffffffffffL

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, LNc/b$b;-><init>(Linet/ipaddr/g;Ljava/lang/String;JJ)V

    goto :goto_0

    :cond_0
    instance-of p1, p1, LNc/a$a$a;

    if-eqz p1, :cond_1

    const/4 v1, 0x0

    :goto_0
    invoke-direct {v0, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LNc/a$a;

    invoke-virtual {p0, p1}, LNc/c$b;->a(LNc/a$a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
