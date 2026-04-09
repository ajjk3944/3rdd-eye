.class final Leb/c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Leb/c;->l()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Leb/c$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Leb/c$d;

    invoke-direct {v0}, Leb/c$d;-><init>()V

    sput-object v0, Leb/c$d;->a:Leb/c$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a([B)Lob/b;
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lub/c;->a:Lub/c;

    invoke-virtual {v0}, Lub/c;->d()Laj/b;

    move-result-object v0

    invoke-static {p1}, Lkotlin/text/t;->y([B)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Laj/b;->a()Lcj/e;

    sget-object v1, Lob/b;->Companion:Lob/b$b;

    invoke-virtual {v1}, Lob/b$b;->serializer()LVi/b;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Laj/b;->b(LVi/a;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lob/b;

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1}, Leb/c$d;->a([B)Lob/b;

    move-result-object p1

    return-object p1
.end method
