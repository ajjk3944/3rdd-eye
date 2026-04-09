.class final Lz8/c$n$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz8/c$n;->a(Lre/c;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lre/c;


# direct methods
.method constructor <init>(Lre/c;)V
    .locals 0

    iput-object p1, p0, Lz8/c$n$b;->a:Lre/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;)Lgg/f;
    .locals 1

    const-string/jumbo v0, "apsToCompare"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lz8/c$n$b;->a:Lre/c;

    invoke-interface {v0, p1}, Lre/c;->g(Ljava/util/Set;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Set;

    invoke-virtual {p0, p1}, Lz8/c$n$b;->a(Ljava/util/Set;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
