.class public abstract La9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/btle/v2/f$a;


# instance fields
.field private final a:La9/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La9/a;

    invoke-direct {v0}, La9/a;-><init>()V

    iput-object v0, p0, La9/c;->a:La9/a;

    return-void
.end method

.method public static final synthetic a(La9/c;)La9/a;
    .locals 0

    iget-object p0, p0, La9/c;->a:La9/a;

    return-object p0
.end method


# virtual methods
.method protected final b([B)V
    .locals 1

    const-string/jumbo v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La9/c;->a:La9/a;

    invoke-virtual {v0, p1}, La9/a;->a([B)V

    return-void
.end method

.method public f()Lgg/z;
    .locals 2

    new-instance v0, La9/c$a;

    invoke-direct {v0, p0}, La9/c$a;-><init>(La9/c;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
