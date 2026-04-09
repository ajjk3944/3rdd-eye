.class final Leb/c$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Leb/c;-><init>(Ljava/lang/String;LGb/f;Leb/g$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Leb/c$j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Leb/c$j;

    invoke-direct {v0}, Leb/c$j;-><init>()V

    sput-object v0, Leb/c$j;->a:Leb/c$j;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Leb/g$c;)Lgg/D;
    .locals 8

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v2, "/api/ws/system"

    const/4 v3, 0x1

    const-wide/16 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Leb/g$c$b;->c(Leb/g$c;Ljava/lang/String;ZJILjava/lang/Object;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Leb/g$c;

    invoke-virtual {p0, p1}, Leb/c$j;->a(Leb/g$c;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
