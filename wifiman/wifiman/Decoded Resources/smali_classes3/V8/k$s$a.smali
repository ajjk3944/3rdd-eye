.class final LV8/k$s$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV8/k$s;->a(LG6/P;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LV8/k;


# direct methods
.method constructor <init>(LV8/k;)V
    .locals 0

    iput-object p1, p0, LV8/k$s$a;->a:LV8/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lhg/c;)V
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, LV8/k$s$a$a;

    iget-object v0, p0, LV8/k$s$a;->a:LV8/k;

    invoke-direct {p1, v0}, LV8/k$s$a$a;-><init>(LV8/k;)V

    invoke-static {p1}, LX8/a;->c(Lmh/a;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lhg/c;

    invoke-virtual {p0, p1}, LV8/k$s$a;->a(Lhg/c;)V

    return-void
.end method
