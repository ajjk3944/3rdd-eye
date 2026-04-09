.class final Ltg/o0$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/o0$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Ltg/o0$a;


# direct methods
.method constructor <init>(Ltg/o0$a;)V
    .locals 0

    iput-object p1, p0, Ltg/o0$a$a;->a:Ltg/o0$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Ltg/o0$a$a;->a:Ltg/o0$a;

    iget-object v0, v0, Ltg/o0$a;->c:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void
.end method
