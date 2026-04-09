.class public final Lqg/M;
.super Lgg/i;
.source "SourceFile"

# interfaces
.implements LDg/e;


# instance fields
.field private final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lgg/i;-><init>()V

    iput-object p1, p0, Lqg/M;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 2

    new-instance v0, Lyg/e;

    iget-object v1, p0, Lqg/M;->b:Ljava/lang/Object;

    invoke-direct {v0, p1, v1}, Lyg/e;-><init>(LDj/b;Ljava/lang/Object;)V

    invoke-interface {p1, v0}, LDj/b;->j(LDj/c;)V

    return-void
.end method

.method public get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lqg/M;->b:Ljava/lang/Object;

    return-object v0
.end method
