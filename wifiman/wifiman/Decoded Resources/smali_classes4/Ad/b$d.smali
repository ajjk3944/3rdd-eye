.class final LAd/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAd/b;->e(LAd/a$b;Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LAd/b$d$b;
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/result/b;

.field final synthetic b:LAd/a$b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/speedtest/result/b;LAd/a$b;)V
    .locals 0

    iput-object p1, p0, LAd/b$d;->a:Lcom/ui/wifiman/model/speedtest/result/b;

    iput-object p2, p0, LAd/b$d;->b:LAd/a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()V
    .locals 0

    invoke-static {}, LAd/b$d;->c()V

    return-void
.end method

.method private static final c()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "Unifi feedback reported"

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, LAd/b$d;->b(Ll9/a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ll9/a;)Lgg/f;
    .locals 5

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbe/c;

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-eqz p1, :cond_5

    iget-object v2, p0, LAd/b$d;->a:Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b;->i()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    iget-object v2, p0, LAd/b$d;->a:Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b;->i()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, LAd/b$d;->b:LAd/a$b;

    invoke-virtual {v3}, LAd/a$b;->a()LAd/a$b$a;

    move-result-object v3

    invoke-virtual {v3}, LAd/a$b$a;->a()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, LAd/b$d;->b:LAd/a$b;

    invoke-virtual {v4}, LAd/a$b;->a()LAd/a$b$a;

    move-result-object v4

    invoke-virtual {v4}, LAd/a$b$a;->b()LAd/a$a;

    move-result-object v4

    if-eqz v4, :cond_4

    sget-object v1, LAd/b$d$b;->a:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v1, v1, v4

    const/4 v4, 0x1

    if-eq v1, v4, :cond_3

    if-eq v1, v0, :cond_2

    const/4 v0, 0x3

    if-eq v1, v0, :cond_1

    const/4 v0, 0x4

    if-ne v1, v0, :cond_0

    const-string v0, "NOT_AS_EXPECTED"

    :goto_0
    move-object v1, v0

    goto :goto_1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const-string v0, "POOR_THROUGHPUT"

    goto :goto_0

    :cond_2
    const-string v0, "POOR_LATENCY"

    goto :goto_0

    :cond_3
    const-string v0, "DROPPED_CONNECTIVITY"

    goto :goto_0

    :cond_4
    :goto_1
    new-instance v0, Lce/e;

    invoke-direct {v0, v3, v1}, Lce/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v2, v0}, Lbe/c;->d(Ljava/lang/String;Lce/e;)Lgg/b;

    move-result-object p1

    new-instance v0, LAd/c;

    invoke-direct {v0}, LAd/c;-><init>()V

    invoke-virtual {p1, v0}, Lgg/b;->x(Lkg/a;)Lgg/b;

    move-result-object p1

    sget-object v0, LAd/b$d$a;->a:LAd/b$d$a;

    invoke-virtual {p1, v0}, Lgg/b;->z(Lkg/f;)Lgg/b;

    move-result-object p1

    goto :goto_2

    :cond_5
    const-string p1, "Skipping unifi feedback report since no unifi api available"

    invoke-static {p1, v1, v0, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_2
    return-object p1
.end method
