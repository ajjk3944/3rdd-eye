.class final LAd/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAd/b;->a(LAd/a$b;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LAd/b;

.field final synthetic b:LAd/a$b;


# direct methods
.method constructor <init>(LAd/b;LAd/a$b;)V
    .locals 0

    iput-object p1, p0, LAd/b$c;->a:LAd/b;

    iput-object p2, p0, LAd/b$c;->b:LAd/a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/f;
    .locals 2

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LAd/b$c;->a:LAd/b;

    iget-object v1, p0, LAd/b$c;->b:LAd/a$b;

    invoke-static {v0, v1, p1}, LAd/b;->c(LAd/b;LAd/a$b;Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/b;

    move-result-object p1

    invoke-static {p1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lgg/b;->H(Ljava/lang/Iterable;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-virtual {p0, p1}, LAd/b$c;->a(Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
