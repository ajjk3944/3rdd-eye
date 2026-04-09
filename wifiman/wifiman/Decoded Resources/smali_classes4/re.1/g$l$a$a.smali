.class final Lre/g$l$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lre/g$l$a;->b(Ljava/lang/Boolean;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wmw/g;


# direct methods
.method constructor <init>(Lcom/ui/wmw/g;)V
    .locals 0

    iput-object p1, p0, Lre/g$l$a$a;->a:Lcom/ui/wmw/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/util/Set;)V
    .locals 0

    invoke-static {p0}, Lre/g$l$a$a;->c(Ljava/util/Set;)V

    return-void
.end method

.method private static final c(Ljava/util/Set;)V
    .locals 9

    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const-string v1, ", "

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "APCompare - Requesting priority channels: ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "] - FINISHED"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Set;

    invoke-virtual {p0, p1}, Lre/g$l$a$a;->b(Ljava/util/Set;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/util/Set;)Lgg/f;
    .locals 2

    const-string v0, "priorityChannels"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lre/g$l$a$a;->a:Lcom/ui/wmw/g;

    invoke-interface {v0}, Lcom/ui/wmw/g;->d()Lcom/ui/wmw/wifi/a$a;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ui/wmw/wifi/a$a;->c(Ljava/util/Set;)Lgg/b;

    move-result-object v0

    new-instance v1, Lre/g$l$a$a$a;

    invoke-direct {v1, p1}, Lre/g$l$a$a$a;-><init>(Ljava/util/Set;)V

    invoke-virtual {v0, v1}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object v0

    new-instance v1, Lre/m;

    invoke-direct {v1, p1}, Lre/m;-><init>(Ljava/util/Set;)V

    invoke-virtual {v0, v1}, Lgg/b;->x(Lkg/a;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
