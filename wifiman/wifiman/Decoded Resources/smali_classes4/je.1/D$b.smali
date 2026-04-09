.class final Lje/D$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lje/D;-><init>(Lje/u;Lfe/u;LT7/d;JJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lfe/u;


# direct methods
.method constructor <init>(JLfe/u;)V
    .locals 0

    iput-wide p1, p0, Lje/D$b;->a:J

    iput-object p3, p0, Lje/D$b;->b:Lfe/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/i;)LDj/a;
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, Lje/D$b;->a:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v3, p0, Lje/D$b;->b:Lfe/u;

    invoke-interface {v3}, Lfe/u;->a()Lgg/y;

    move-result-object v3

    invoke-virtual {p1, v0, v1, v2, v3}, Lgg/i;->S(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgg/i;

    invoke-virtual {p0, p1}, Lje/D$b;->a(Lgg/i;)LDj/a;

    move-result-object p1

    return-object p1
.end method
