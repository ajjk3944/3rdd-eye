.class final Lq7/a$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq7/a;-><init>(JLgg/y;Lgg/y;Lv7/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lq7/a;


# direct methods
.method constructor <init>(Lq7/a;)V
    .locals 0

    iput-object p1, p0, Lq7/a$e;->a:Lq7/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lgg/f;
    .locals 2

    const-string/jumbo v0, "events"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq7/a$e;->a:Lq7/a;

    new-instance v1, Lq7/a$e$b;

    invoke-direct {v1, v0, p1}, Lq7/a$e$b;-><init>(Lq7/a;Ljava/util/List;)V

    invoke-static {v1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026       it\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lq7/a$e;->a(Ljava/util/List;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
