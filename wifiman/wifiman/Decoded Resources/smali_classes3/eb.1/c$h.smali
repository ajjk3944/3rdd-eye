.class final Leb/c$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Leb/c;->n()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Leb/c$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Leb/c$h;

    invoke-direct {v0}, Leb/c$h;-><init>()V

    sput-object v0, Leb/c$h;->a:Leb/c$h;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lgb/k;
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lub/c;->a:Lub/c;

    invoke-virtual {v0}, Lub/c;->d()Laj/b;

    move-result-object v0

    invoke-virtual {v0}, Laj/b;->a()Lcj/e;

    sget-object v1, Lgb/k;->Companion:Lgb/k$b;

    invoke-virtual {v1}, Lgb/k$b;->serializer()LVi/b;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Laj/b;->b(LVi/a;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgb/k;

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Leb/c$h;->a(Ljava/lang/String;)Lgb/k;

    move-result-object p1

    return-object p1
.end method
