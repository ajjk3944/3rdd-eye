.class final Ltg/f0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "b"
.end annotation


# instance fields
.field private final a:Ltg/f0$a;

.field final synthetic b:Ltg/f0;


# direct methods
.method constructor <init>(Ltg/f0;Ltg/f0$a;)V
    .locals 0

    iput-object p1, p0, Ltg/f0$b;->b:Ltg/f0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ltg/f0$b;->a:Ltg/f0$a;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Ltg/f0$b;->b:Ltg/f0;

    iget-object v0, v0, Ltg/a;->a:Lgg/v;

    iget-object v1, p0, Ltg/f0$b;->a:Ltg/f0$a;

    invoke-interface {v0, v1}, Lgg/v;->d(Lgg/x;)V

    return-void
.end method
