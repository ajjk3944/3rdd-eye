.class final LO1/l$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO1/l;-><init>(Lmh/a;LO1/j;Ljava/util/List;LO1/a;LIi/N;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LO1/l$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LO1/l$e;

    invoke-direct {v0}, LO1/l$e;-><init>()V

    sput-object v0, LO1/l$e;->a:LO1/l$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LO1/l$b;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LO1/l$b$b;

    if-eqz v0, :cond_1

    check-cast p1, LO1/l$b$b;

    invoke-virtual {p1}, LO1/l$b$b;->a()LIi/x;

    move-result-object p1

    if-nez p2, :cond_0

    new-instance p2, Ljava/util/concurrent/CancellationException;

    const-string v0, "DataStore scope was cancelled before updateData could complete"

    invoke-direct {p2, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    :cond_0
    invoke-interface {p1, p2}, LIi/x;->a(Ljava/lang/Throwable;)Z

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO1/l$b;

    check-cast p2, Ljava/lang/Throwable;

    invoke-virtual {p0, p1, p2}, LO1/l$e;->a(LO1/l$b;Ljava/lang/Throwable;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
