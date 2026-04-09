.class final Leb/c$c;
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
.field public static final a:Leb/c$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Leb/c$c;

    invoke-direct {v0}, Leb/c$c;-><init>()V

    sput-object v0, Leb/c$c;->a:Leb/c$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Leb/g$c;)Lgg/D;
    .locals 3

    const-string/jumbo v0, "dataClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkb/o;->GET:Lkb/o;

    const/4 v1, 0x0

    const-string v2, "/api/users/self"

    invoke-interface {p1, v2, v0, v1, v1}, Leb/g$c;->b(Ljava/lang/String;Lkb/o;Ljava/lang/String;Ljava/util/Map;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Leb/g$c;

    invoke-virtual {p0, p1}, Leb/c$c;->a(Leb/g$c;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
