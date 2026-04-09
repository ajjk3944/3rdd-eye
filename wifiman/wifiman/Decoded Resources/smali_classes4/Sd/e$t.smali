.class final LSd/e$t;
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
.field public static final a:LSd/e$t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LSd/e$t;

    invoke-direct {v0}, LSd/e$t;-><init>()V

    sput-object v0, LSd/e$t;->a:LSd/e$t;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)LYg/s;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll9/a;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll9/a;

    invoke-virtual {v0}, Ll9/a;->b()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1}, Ll9/a;->b()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, LSd/e$t;->a(LYg/s;)LYg/s;

    move-result-object p1

    return-object p1
.end method
