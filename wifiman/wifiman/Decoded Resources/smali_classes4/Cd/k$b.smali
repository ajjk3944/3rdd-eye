.class final LCd/k$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCd/k;->a(Linet/ipaddr/g;J)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LCd/k$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LCd/k$b;

    invoke-direct {v0}, LCd/k$b;-><init>()V

    sput-object v0, LCd/k$b;->a:LCd/k$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LKa/f$b;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LKa/f$b;

    invoke-virtual {p0, p1}, LCd/k$b;->a(LKa/f$b;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
