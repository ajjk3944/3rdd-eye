.class Lo4/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo4/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field final a:Lv4/d$a;


# direct methods
.method constructor <init>(Lv4/d$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo4/i$a;->a:Lv4/d$a;

    return-void
.end method

.method private b(Lcom/google/crypto/tink/shaded/protobuf/M;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 1

    iget-object v0, p0, Lo4/i$a;->a:Lv4/d$a;

    invoke-virtual {v0, p1}, Lv4/d$a;->e(Lcom/google/crypto/tink/shaded/protobuf/M;)V

    iget-object v0, p0, Lo4/i$a;->a:Lv4/d$a;

    invoke-virtual {v0, p1}, Lv4/d$a;->a(Lcom/google/crypto/tink/shaded/protobuf/M;)Lcom/google/crypto/tink/shaded/protobuf/M;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method a(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 1

    iget-object v0, p0, Lo4/i$a;->a:Lv4/d$a;

    invoke-virtual {v0, p1}, Lv4/d$a;->d(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/M;

    move-result-object p1

    invoke-direct {p0, p1}, Lo4/i$a;->b(Lcom/google/crypto/tink/shaded/protobuf/M;)Lcom/google/crypto/tink/shaded/protobuf/M;

    move-result-object p1

    return-object p1
.end method
