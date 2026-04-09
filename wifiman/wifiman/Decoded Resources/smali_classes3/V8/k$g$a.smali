.class final LV8/k$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV8/k$g;->a(LG6/O;)Lgg/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lgg/b;


# direct methods
.method constructor <init>(Lgg/b;)V
    .locals 0

    iput-object p1, p0, LV8/k$g$a;->a:Lgg/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LG6/N;)LYg/s;
    .locals 1

    const-string/jumbo v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LV8/k$g$a;->a:Lgg/b;

    invoke-static {p1, v0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LG6/N;

    invoke-virtual {p0, p1}, LV8/k$g$a;->a(LG6/N;)LYg/s;

    move-result-object p1

    return-object p1
.end method
