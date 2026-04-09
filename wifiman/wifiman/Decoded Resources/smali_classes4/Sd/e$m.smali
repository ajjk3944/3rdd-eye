.class final LSd/e$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSd/e;-><init>(LDc/e;LLd/f;LSd/a;Lfe/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LSd/e$m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LSd/e$m;

    invoke-direct {v0}, LSd/e$m;-><init>()V

    sput-object v0, LSd/e$m;->a:LSd/e$m;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)LDj/a;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LLd/e;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LLd/e;->d()Lcom/ui/wifiman/model/ubiquiti/console/b;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/ui/wifiman/model/ubiquiti/console/b;->c()Lgg/i;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, LWc/b$c;

    invoke-direct {p1}, LWc/b$c;-><init>()V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, LSd/e$m;->a(Ll9/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
