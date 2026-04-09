.class final Lda/I$j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lda/I$j;->d(Ljava/lang/CharSequence;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lda/I$j$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lda/I$j$a;

    invoke-direct {v0}, Lda/I$j$a;-><init>()V

    sput-object v0, Lda/I$j$a;->a:Lda/I$j$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lgg/D;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lda/I$j$a;->a(Ljava/lang/Throwable;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
