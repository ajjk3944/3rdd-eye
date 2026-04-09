.class final LNd/f$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNd/f;-><init>(Lcom/ui/sso/api/UiAccountApi$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LNd/f$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LNd/f$d;

    invoke-direct {v0}, LNd/f$d;-><init>()V

    sput-object v0, LNd/f$d;->a:LNd/f$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LLi/g;)LDj/a;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, LQi/i;->c(LLi/g;Ldh/i;ILjava/lang/Object;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LLi/g;

    invoke-virtual {p0, p1}, LNd/f$d;->a(LLi/g;)LDj/a;

    move-result-object p1

    return-object p1
.end method
