.class public final LJ0/s;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# static fields
.field public static final a:LJ0/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJ0/s;

    invoke-direct {v0}, LJ0/s;-><init>()V

    sput-object v0, LJ0/s;->a:LJ0/s;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LJ0/a;LJ0/a;)LJ0/a;
    .locals 2

    new-instance v0, LJ0/a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LJ0/a;->b()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    invoke-virtual {p2}, LJ0/a;->b()Ljava/lang/String;

    move-result-object v1

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, LJ0/a;->a()LYg/i;

    move-result-object p1

    if-nez p1, :cond_3

    :cond_2
    invoke-virtual {p2}, LJ0/a;->a()LYg/i;

    move-result-object p1

    :cond_3
    invoke-direct {v0, v1, p1}, LJ0/a;-><init>(Ljava/lang/String;LYg/i;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJ0/a;

    check-cast p2, LJ0/a;

    invoke-virtual {p0, p1, p2}, LJ0/s;->a(LJ0/a;LJ0/a;)LJ0/a;

    move-result-object p1

    return-object p1
.end method
