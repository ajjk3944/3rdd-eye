.class final Lyd/b$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyd/b;->b(Lcom/ui/wifiman/model/speedtest/Speedtest$d;LW7/b;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lyd/b$m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lyd/b$m;

    invoke-direct {v0}, Lyd/b$m;-><init>()V

    sput-object v0, Lyd/b$m;->a:Lyd/b$m;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LCc/j;)Ll9/a;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll9/a;

    invoke-virtual {p1}, LCc/j;->j()LDc/j;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LDc/j;->N()LS8/g;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LCc/j;

    invoke-virtual {p0, p1}, Lyd/b$m;->a(LCc/j;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
