.class public final Lsj/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj/c;


# instance fields
.field private final a:Lmh/a;


# direct methods
.method public constructor <init>(Lmh/a;)V
    .locals 1

    const-string v0, "getContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsj/d;->a:Lmh/a;

    return-void
.end method

.method public static final synthetic b(Lsj/d;)Lmh/a;
    .locals 0

    iget-object p0, p0, Lsj/d;->a:Lmh/a;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lth/l;)LYg/m;
    .locals 0

    new-instance p2, Lsj/d$a;

    invoke-direct {p2, p1, p0}, Lsj/d$a;-><init>(Ljava/lang/Object;Lsj/d;)V

    invoke-static {p2}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    return-object p1
.end method
