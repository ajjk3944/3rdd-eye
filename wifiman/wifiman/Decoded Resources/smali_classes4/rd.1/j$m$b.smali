.class final Lrd/j$m$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrd/j$m;->a(Lrd/j$c;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lrd/j;


# direct methods
.method constructor <init>(Lrd/j;)V
    .locals 0

    iput-object p1, p0, Lrd/j$m$b;->a:Lrd/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LDj/c;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lrd/j$m$b;->a:Lrd/j;

    invoke-static {p1}, Lrd/j;->i(Lrd/j;)LFg/b;

    move-result-object p1

    sget-object v0, Lrd/a$a$b$b;->a:Lrd/a$a$b$b;

    invoke-interface {p1, v0}, LDj/b;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LDj/c;

    invoke-virtual {p0, p1}, Lrd/j$m$b;->a(LDj/c;)V

    return-void
.end method
