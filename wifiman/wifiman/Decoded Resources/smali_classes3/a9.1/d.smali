.class public abstract La9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/btle/v2/f$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a([B)Lgg/b;
    .locals 1

    const-string/jumbo v0, "frame"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La9/d$b;

    invoke-direct {v0, p1}, La9/d$b;-><init>([B)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La9/d$a;

    invoke-direct {v0, p0}, La9/d$a;-><init>(La9/d;)V

    invoke-virtual {p1, v0}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "final override fun write\u2026ngPacketFrame(it) }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method protected abstract b([B)Lgg/b;
.end method
