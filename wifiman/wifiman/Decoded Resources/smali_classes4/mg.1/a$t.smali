.class final Lmg/a$t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;
.implements Lkg/q;
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmg/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "t"
.end annotation


# instance fields
.field final a:Ljava/lang/Object;


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmg/a$t;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, Lmg/a$t;->a:Ljava/lang/Object;

    return-object p1
.end method

.method public call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lmg/a$t;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lmg/a$t;->a:Ljava/lang/Object;

    return-object v0
.end method
