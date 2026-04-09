.class final Lrd/j$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrd/j;->n()Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lrd/j$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrd/j$h;

    invoke-direct {v0}, Lrd/j$h;-><init>()V

    sput-object v0, Lrd/j$h;->a:Lrd/j$h;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LJa/a;)LDj/a;
    .locals 2

    const-string v0, "server"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LJa/a;->start()LLi/g;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, LQi/i;->c(LLi/g;Ldh/i;ILjava/lang/Object;)Lgg/i;

    move-result-object p1

    sget-object v0, Lrd/j$h$a;->a:Lrd/j$h$a;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJa/a;

    invoke-virtual {p0, p1}, Lrd/j$h;->a(LJa/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
