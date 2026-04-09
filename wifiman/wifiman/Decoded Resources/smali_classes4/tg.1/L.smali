.class public final Ltg/L;
.super Lgg/s;
.source "SourceFile"

# interfaces
.implements LDg/e;


# instance fields
.field private final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lgg/s;-><init>()V

    iput-object p1, p0, Ltg/L;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 2

    new-instance v0, Ltg/a0$a;

    iget-object v1, p0, Ltg/L;->a:Ljava/lang/Object;

    invoke-direct {v0, p1, v1}, Ltg/a0$a;-><init>(Lgg/x;Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Lgg/x;->c(Lhg/c;)V

    invoke-virtual {v0}, Ltg/a0$a;->run()V

    return-void
.end method

.method public get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ltg/L;->a:Ljava/lang/Object;

    return-object v0
.end method
