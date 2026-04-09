.class final Lld/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lld/c;-><init>(LUb/a;Lmd/b;LP7/a;LQ7/a;Lcom/ui/wifiman/model/support/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lld/c$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lld/c$c;

    invoke-direct {v0}, Lld/c$c;-><init>()V

    sput-object v0, Lld/c$c;->a:Lld/c$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x4

    const-string v2, "Init App session error"

    invoke-static {v2, p1, v0, v1, v0}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lld/c$c;->a(Ljava/lang/Throwable;)V

    return-void
.end method
