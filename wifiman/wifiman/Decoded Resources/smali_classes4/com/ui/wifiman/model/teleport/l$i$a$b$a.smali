.class final Lcom/ui/wifiman/model/teleport/l$i$a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/l$i$a$b;->a(Lgg/i;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/L;

.field final synthetic b:J


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/L;J)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/l$i$a$b$a;->a:Lkotlin/jvm/internal/L;

    iput-wide p2, p0, Lcom/ui/wifiman/model/teleport/l$i$a$b$a;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)LDj/a;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/ui/wifiman/model/teleport/l$i$a$b$a;->a:Lkotlin/jvm/internal/L;

    iget-wide v0, p0, Lcom/ui/wifiman/model/teleport/l$i$a$b$a;->b:J

    new-instance v2, Lcom/ui/wifiman/model/teleport/l$i$a$b$a$b;

    invoke-direct {v2, p1, v0, v1}, Lcom/ui/wifiman/model/teleport/l$i$a$b$a$b;-><init>(Lkotlin/jvm/internal/L;J)V

    invoke-static {v2}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/wifiman/model/teleport/l$i$a$b$a$a;->a:Lcom/ui/wifiman/model/teleport/l$i$a$b$a$a;

    invoke-virtual {p1, v0}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/l$i$a$b$a;->a(Ljava/lang/Object;)LDj/a;

    move-result-object p1

    return-object p1
.end method
