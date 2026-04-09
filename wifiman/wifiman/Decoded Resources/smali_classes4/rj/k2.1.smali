.class public final Lrj/k2;
.super Lrj/j2;
.source "SourceFile"


# instance fields
.field private final c:Lorg/kodein/di/h;


# direct methods
.method public constructor <init>(Luj/e;Ljava/lang/String;Lorg/kodein/di/h;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tree"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lrj/j2;-><init>(Luj/e;Ljava/lang/String;)V

    iput-object p3, p0, Lrj/k2;->c:Lorg/kodein/di/h;

    return-void
.end method


# virtual methods
.method public final c()Lorg/kodein/di/h;
    .locals 1

    iget-object v0, p0, Lrj/k2;->c:Lorg/kodein/di/h;

    return-object v0
.end method
