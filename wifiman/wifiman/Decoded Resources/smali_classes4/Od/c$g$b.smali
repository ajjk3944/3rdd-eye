.class final LOd/c$g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOd/c$g;->a(Ljava/lang/Boolean;)Lgg/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LOd/c$g$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LOd/c$g$b;

    invoke-direct {v0}, LOd/c$g$b;-><init>()V

    sput-object v0, LOd/c$g$b;->a:LOd/c$g$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LOd/c$g$b;->a(Ljava/lang/Boolean;)Z

    move-result p1

    return p1
.end method
