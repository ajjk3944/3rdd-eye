.class final Ldb/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldb/a;->a()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ldb/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ldb/a$a;

    invoke-direct {v0}, Ldb/a$a;-><init>()V

    sput-object v0, Ldb/a$a;->a:Ldb/a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Llb/a;)Llb/o;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Llb/a;->a()Llb/o;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Llb/a;

    invoke-virtual {p0, p1}, Ldb/a$a;->a(Llb/a;)Llb/o;

    move-result-object p1

    return-object p1
.end method
