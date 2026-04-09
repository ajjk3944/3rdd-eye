.class public final LJ7/F$b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/F$b;->a(Ljava/lang/String;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LJ7/n;

.field final synthetic b:Lkotlin/jvm/internal/N;

.field final synthetic c:J


# direct methods
.method public constructor <init>(LJ7/n;Lkotlin/jvm/internal/N;J)V
    .locals 0

    iput-object p1, p0, LJ7/F$b$a;->a:LJ7/n;

    iput-object p2, p0, LJ7/F$b$a;->b:Lkotlin/jvm/internal/N;

    iput-wide p3, p0, LJ7/F$b$a;->c:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lgg/D;
    .locals 4

    iget-object v0, p0, LJ7/F$b$a;->a:LJ7/n;

    invoke-virtual {v0}, LJ7/n;->j()LK7/a;

    move-result-object v0

    const-string/jumbo v1, "requestId"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, LK7/a;->a(Ljava/lang/String;)Lgg/z;

    move-result-object p1

    new-instance v0, LJ7/F$b$a$a;

    iget-object v1, p0, LJ7/F$b$a;->a:LJ7/n;

    invoke-direct {v0, v1}, LJ7/F$b$a$a;-><init>(LJ7/n;)V

    new-instance v1, LJ7/n$e;

    invoke-direct {v1, v0}, LJ7/n$e;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    new-instance v0, LJ7/F$b$a$b;

    iget-object v1, p0, LJ7/F$b$a;->b:Lkotlin/jvm/internal/N;

    iget-wide v2, p0, LJ7/F$b$a;->c:J

    invoke-direct {v0, v1, v2, v3}, LJ7/F$b$a$b;-><init>(Lkotlin/jvm/internal/N;J)V

    new-instance v1, LJ7/n$e;

    invoke-direct {v1, v0}, LJ7/n$e;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/z;->L(Lkg/n;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, LJ7/F$b$a;->a(Ljava/lang/String;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
