.class final Ljb/m$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljb/m;->i()Lgg/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ljb/m$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljb/m$b;

    invoke-direct {v0}, Ljb/m$b;-><init>()V

    sput-object v0, Ljb/m$b;->a:Ljb/m$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Llb/o;
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lub/c;->a:Lub/c;

    invoke-virtual {v0}, Lub/c;->d()Laj/b;

    move-result-object v0

    invoke-virtual {v0}, Laj/b;->a()Lcj/e;

    sget-object v1, Llb/o;->Companion:Llb/o$b;

    invoke-virtual {v1}, Llb/o$b;->serializer()LVi/b;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Laj/b;->b(LVi/a;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llb/o;

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljb/m$b;->a(Ljava/lang/String;)Llb/o;

    move-result-object p1

    return-object p1
.end method
