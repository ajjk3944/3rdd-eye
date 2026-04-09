.class final LKa/e$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKa/e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lspeedtest/Speedtest_;


# direct methods
.method constructor <init>(Lspeedtest/Speedtest_;)V
    .locals 0

    iput-object p1, p0, LKa/e$a$a;->a:Lspeedtest/Speedtest_;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, LKa/e$a$a;->a:Lspeedtest/Speedtest_;

    invoke-virtual {v0}, Lspeedtest/Speedtest_;->cancel()V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LKa/e$a$a;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
