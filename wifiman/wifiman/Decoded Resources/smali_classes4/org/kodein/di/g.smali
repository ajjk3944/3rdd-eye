.class public final Lorg/kodein/di/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrj/x2;


# instance fields
.field private final a:Lorg/kodein/di/f;

.field private final b:Lmh/p;


# direct methods
.method public constructor <init>(Lrj/l2;Lorg/kodein/di/f;Lmh/p;)V
    .locals 0

    const-string p1, "originalContext"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "get"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lorg/kodein/di/g;->a:Lorg/kodein/di/f;

    iput-object p3, p0, Lorg/kodein/di/g;->b:Lmh/p;

    return-void
.end method

.method public static final synthetic b(Lorg/kodein/di/g;)Lmh/p;
    .locals 0

    iget-object p0, p0, Lorg/kodein/di/g;->b:Lmh/p;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lth/l;)LYg/m;
    .locals 1

    const-string v0, "prop"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/kodein/di/g$a;

    invoke-direct {v0, p1, p0, p2}, Lorg/kodein/di/g$a;-><init>(Ljava/lang/Object;Lorg/kodein/di/g;Lth/l;)V

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    return-object p1
.end method

.method public final c()Lorg/kodein/di/f;
    .locals 1

    iget-object v0, p0, Lorg/kodein/di/g;->a:Lorg/kodein/di/f;

    return-object v0
.end method
