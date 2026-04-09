.class public final LJ7/F$b$a$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/F$b$a;->a(Ljava/lang/String;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/N;

.field final synthetic b:J


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/N;J)V
    .locals 0

    iput-object p1, p0, LJ7/F$b$a$b;->a:Lkotlin/jvm/internal/N;

    iput-wide p2, p0, LJ7/F$b$a$b;->b:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lgg/i;)LDj/a;
    .locals 4

    new-instance v0, LJ7/F$b$a$b$a;

    iget-object v1, p0, LJ7/F$b$a$b;->a:Lkotlin/jvm/internal/N;

    iget-wide v2, p0, LJ7/F$b$a$b;->b:J

    invoke-direct {v0, v1, v2, v3}, LJ7/F$b$a$b$a;-><init>(Lkotlin/jvm/internal/N;J)V

    new-instance v1, LJ7/n$e;

    invoke-direct {v1, v0}, LJ7/n$e;-><init>(Lmh/l;)V

    invoke-virtual {p1, v1}, Lgg/i;->p0(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgg/i;

    invoke-virtual {p0, p1}, LJ7/F$b$a$b;->a(Lgg/i;)LDj/a;

    move-result-object p1

    return-object p1
.end method
