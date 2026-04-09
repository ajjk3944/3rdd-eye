.class final LDc/t$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDc/t;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LDc/t;


# direct methods
.method constructor <init>(LDc/t;)V
    .locals 0

    iput-object p1, p0, LDc/t$h;->a:LDc/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LDj/c;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LDc/t$h;->a:LDc/t;

    invoke-virtual {p1}, LDc/t;->i()Ljava/lang/String;

    move-result-object p1

    const-string v0, "SUBSCRIBED"

    invoke-static {v0, p1}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LDj/c;

    invoke-virtual {p0, p1}, LDc/t$h;->a(LDj/c;)V

    return-void
.end method
