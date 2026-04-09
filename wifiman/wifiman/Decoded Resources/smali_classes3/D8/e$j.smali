.class final LD8/e$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/e;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LD8/e;


# direct methods
.method constructor <init>(LD8/e;)V
    .locals 0

    iput-object p1, p0, LD8/e$j;->a:LD8/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lef/b;

    check-cast p2, LS8/c;

    check-cast p3, Ll9/a;

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2, p3, p4}, LD8/e$j;->b(Lef/b;LS8/c;Ll9/a;Ljava/lang/Boolean;)LCi/c;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lef/b;LS8/c;Ll9/a;Ljava/lang/Boolean;)LCi/c;
    .locals 1

    const-string/jumbo v0, "topic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "band"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "isApDeeplinkAvailable"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Laf/P;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    iget-object v0, p0, LD8/e$j;->a:LD8/e;

    invoke-static {v0, p1, p2, p3, p4}, LD8/e;->q0(LD8/e;Lef/b;LS8/c;Laf/P;Z)LCi/c;

    move-result-object p1

    return-object p1
.end method
